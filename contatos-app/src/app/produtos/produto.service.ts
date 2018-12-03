import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Produto } from './produto';

@Injectable({
  providedIn: 'root'
})
export class ProdutoService {

  constructor(private http: HttpClient) { }

  buscarProdutos(): Observable<Produto[]> {
    return this.http.get<Produto[]>('/api/produtos');
  }

  buscarProdutoPorId(id: any): Observable<Produto> {
    return this.http.get<Produto>(`/api/produtos/${id}`)
  }
  salvar(produto: Produto): Observable<Produto> {
    if (!produto.id) {
      return this.http.post<Produto>('/api/produtos', produto);
    } else {
      return this.http.put(`/api/produtos/${produto.id}`, produto);
    }
  }

  remover(id: any) {
    return this.http.delete(`/api/produtos/${id}`);
  }





}
