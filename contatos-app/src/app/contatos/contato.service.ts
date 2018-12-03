import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Contato } from './contato';

@Injectable({
  providedIn: 'root'
})
export class ContatoService {

  constructor(private http: HttpClient) { }


  buscarContatos(): Observable<Contato[]> {
    return this.http.get<Contato[]>('/api/contatos');
  }

  buscarContatoPorId(id: any): Observable<Contato> {
    return this.http.get<Contato>(`/api/contatos/${id}`)
  }

  salvar(contato: Contato): Observable<Contato> {
    if (!contato.id) {
      return this.http.post<Contato>('/api/contatos', contato);
    } else {
      return this.http.put(`/api/contatos/${contato.id}`, contato);
    }
  }

  remover(id: any) {
    return this.http.delete(`/api/contatos/${id}`);
  }

}

