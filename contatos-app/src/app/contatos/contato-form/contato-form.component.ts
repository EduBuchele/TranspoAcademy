import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms'
import { Router, ActivatedRoute } from '@angular/router';
import { ContatoService } from '../contato.service';
import { Contato } from '../contato';


@Component({
  selector: 'app-contato-form',
  templateUrl: './contato-form.component.html',
  styleUrls: ['./contato-form.component.css']
})
export class ContatoFormComponent implements OnInit {

  contatoForm = this.fb.group({
    id: [''],
    nome: ['', Validators.required],
    email: ['', [Validators.required, Validators.email]],
    telefone: ['']
  });
  constructor(
    private fb: FormBuilder,
    private router: Router,
    private route: ActivatedRoute,
    private service: ContatoService

  ) { }

  ngOnInit() {
    const id = this.route.snapshot.paramMap.get('id');
    if (id && id != 'novo') {
      this.service.buscarContatoPorId(id)
        .subscribe(data => {
          this.contatoForm.patchValue(data);
        })
    }
  }

  onSubmit() {
    const { id, nome, email, telefone } = this.contatoForm.value;
    const contato = new Contato(parseInt(id) || undefined, nome, email, telefone);
    this.service.salvar(contato)
      .subscribe((contato:Contato) => {
        this.router.navigateByUrl('contatos');
      },
        (error) => {
          alert('Falha ao salvar os dados do contato')
        }
      )
  }

}
