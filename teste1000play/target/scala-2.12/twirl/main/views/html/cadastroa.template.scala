
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object cadastroa extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<!doctype html>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous"> 
    <link rel="stylesheet" href=>
    <title>"""),_display_(/*9.13*/title),format.raw/*9.18*/("""</title>
<link rel="stylesheet" media="screen"
href="../../public/stylesheets/main.css">
</head>
    <body>
        <div class="fundoTela1">
            <img class="logo" src="../../public/images/logo.png" style="width:30%">
        </div>
        <div class="formulario">
        <a href="#"><p class="link"><i class="fas fa-long-arrow-alt-left"></i> Voltar para o início</p></a>
        <h3>Crie sua conta no <strong>Doelê</strong></h3>
        <!-- As próximas tres linhas são apenas uma tag -->
        <p style="color: #aaa; padding-left: 20%; padding-top:1%;"><img src="../../public/images/icon-instituicao.png" 
        style="width:2.5%; padding-right: 0.5%; padding-bottom: 0.2%;";> Sou uma instituição. 
        <a class="paragrafo" href="cadastro_instituicao.html"> Cadastre-se aqui!</a></p>
        <!-- final da tag -->
        <hr width="60%" style="margin-top: 3%; border: 0.5px solid #aaa">
        <div style="position: relative; top: -5%; text-align: center;">
            <span style="padding: 1%; font-size: 14px; color: #aaa; background-color: white"><strong>Prenchaa o campo abaixo</strong></span>
        </div>
        <div class="dados_formulario">
            <form>
            <input type="text" name="Primeiro Nome" placeholder="Primeiro Nome"><br>
            <input type="text" name="Último Nome" placeholder="Último Nome"><br>
            <input type="text" name="Data de Nascimento" placeholder="Data de Nascimento"><br>
            <input type="email" name="Email" placeholder="Email"><br>
            <input type="password" name="Senha" placeholder="Senha"><br>
            <input type="password" name="Confirmar Senha" placeholder="Confirmar Senha"><br>
            </form>
            <button class="btn btn-gradient">CRIAR UMA CONTA GRÁTIS</button>   
            <p style="color:#aaa;">Já sou cadastrado.<a class="paragrafo" href="#"> Fazer login!</a></p>
        </div>
        </div>
          

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>   
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script> 
  </body>
</html>)"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 12 18:23:56 GMT-03:00 2019
                  SOURCE: C:/Users/Junior.GERSON/Desktop/teste1000play/app/views/cadastroa.scala.html
                  HASH: 16fba6c26c8f4e09c2569678ce34d57ff7e44345
                  MATRIX: 952->1|1062->16|1092->20|1505->407|1530->412
                  LINES: 28->1|33->1|35->3|41->9|41->9
                  -- GENERATED --
              */
          