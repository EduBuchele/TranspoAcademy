import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ContatoListComponent } from './contatos/contato-list/contato-list.component';
import { ContatoFormComponent } from './contatos/contato-form/contato-form.component';
import { ProdutoListComponent } from './produtos/produto-list/produto-list.component';
import { ProdutoFormComponent } from './produtos/produto-form/produto-form.component';
const routes: Routes = [
{
  path:"contatos",
  component:ContatoListComponent
},
{
  path:"",
  redirectTo:"contatos",
  pathMatch: 'full'
},
{
  path:"contatos/:id",
  component:ContatoFormComponent
},
{
  path:"produtos",
  component:ProdutoListComponent
},
{
  path:"produtos/:id",
  component:ProdutoFormComponent
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
