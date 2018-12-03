import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms'
import { Router, ActivatedRoute } from '@angular/router';
import { ProdutoService } from '../produto.service';
import { Produto } from '../produto';


@Component({
  selector: 'app-produto-form',
  templateUrl: './produto-form.component.html',
  styleUrls: ['./produto-form.component.css']
})
export class ProdutoFormComponent implements OnInit {

  produtoForm = this.fb.group({
    id: [''],
    nome: ['', Validators.required],
    descricao: ['', Validators.required],
    preco: ['']
  });
  constructor(
    private fb: FormBuilder,
    private router: Router,
    private route: ActivatedRoute,
    private service: ProdutoService

  ) { }

  ngOnInit() {
    const id = this.route.snapshot.paramMap.get('id');
    if (id && id != 'novo') {
      this.service.buscarProdutoPorId(id)
        .subscribe(data => {
          this.produtoForm.patchValue(data);
        })
    }
  }

  onSubmit() {
    const { id, nome, descricao, preco } = this.produtoForm.value;
    const produto = new Produto(parseInt(id) || undefined, nome, descricao, preco);
    this.service.salvar(produto)
      .subscribe((produto:Produto) => {
        this.router.navigateByUrl('produtos');
      },
        (error) => {
          alert('Falha ao salvar os dados do produto')
        }
      )
  }

}
