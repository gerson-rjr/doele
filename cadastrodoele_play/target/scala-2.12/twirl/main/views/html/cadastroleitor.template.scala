
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

/**/
class cadastroleitor @javax.inject.Inject() /*1.6*/(webJarsUtil: org.webjars.play.WebJarsUtil) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<!doctype html>
<head>
    """),_display_(/*5.6*/webJarsUtil/*5.17*/.locate("bootstrap.min.css").css()),format.raw/*5.51*/("""
    """),format.raw/*6.5*/("""<title>Doelê - Cadastro Leitor</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*7.50*/routes/*7.56*/.Assets.versioned("stylesheets/cadastro.css")),format.raw/*7.101*/("""">
    """),_display_(/*8.6*/webJarsUtil/*8.17*/.locate("bootstrap.js").script()),format.raw/*8.49*/("""
    """),format.raw/*9.5*/("""<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
</head>
    <body>
        <div class="fundoTela1">
            <img class="logo" src=""""),_display_(/*13.37*/routes/*13.43*/.Assets.versioned("images/logo.png")),format.raw/*13.79*/("""" style="width:30%">
        </div>
        <div class="formulario">
        <a href="#"><p class="link"><i class="fas fa-long-arrow-alt-left"></i> Voltar para o início</p></a>
        <h3>Crie sua conta no <strong>Doelê</strong></h3>
        <!-- As próximas tres linhas são apenas uma tag -->
        <p style="color: #aaa; padding-left: 20%; padding-top:1%;"><img src=""""),_display_(/*19.79*/routes/*19.85*/.Assets.versioned("images/icon-instituicao")),format.raw/*19.129*/("""" 
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

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 14 09:52:22 GMT-03:00 2019
                  SOURCE: C:/Users/Junior.GERSON/Desktop/cadastrodoele/app/views/cadastroleitor.scala.html
                  HASH: 4448ba12bf77f9319a75e78bda9be195d90eba28
                  MATRIX: 701->5|1117->52|1172->82|1191->93|1245->127|1277->133|1392->222|1406->228|1472->273|1506->282|1525->293|1577->325|1609->331|1923->618|1938->624|1995->660|2401->1039|2416->1045|2482->1089
                  LINES: 26->1|34->3|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|44->13|44->13|44->13|50->19|50->19|50->19
                  -- GENERATED --
              */
          