<%@ page import="Banks.Current" %>
<%@ page import="DataBase.GetFromDB" %>
<%@ page import="DataBase.StartGet" %>
<%@ page import="static java.lang.Thread.sleep" %>
<%@ page import="DataBase.StartThreads" %>
<%@ page import="DataBase.PutInDB" %>
<%--
  Created by IntelliJ IDEA.
  User: Scirocco
  Date: 23.09.14
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" type="text/css" href="styles.css"/>
<link href="css/styles.css" rel="stylesheet">
<link href="css/mystyle.css" rel="stylesheet">
<link href="css/jquery-1.11.1.min.css" rel="stylesheet">
<script src="js.bootstrap.min.js"></script>
<link href="http://fonts.googleapis.com/css?family=Oswald:400,300" rel="stylesheet">
  <head>
    <title></title>
  </head>
  <body>
  <%StartThreads.start();%>
  <div class="wrapper container">
      <header>
          <a href="/"><img src="images/logo.png" alt="Курс валют"></a>
          <form name="search" action="#" method="get" class="form-inline form-search pull-right">
              <div class="input-group">
                  <label class="sr-only" for="searchInput">Поиск</label>
                  <input class="form-control" id="searchInput" type="text" name="search" placeholder="поиск">
                  <div class="input-group-btn">
                      <button type="submit" class="btn btn-primary">GO</button>
                  </div>
              </div>
          </form>
      </header>
      <nav class="navbar navbar-default">
          <ul class="nav navbar-nav">
              <li><a href="main.html">Главная</a></li>
              <li ><a href="about.html">О сервисе</a></li>
              <li class="active"><a href="currency.jsp">Текущий курс</a></li>
              <li ><a href="ukrbanks.html">Банки Украины</a></li>
              <li><a href="author.html">Об авторе</a></li>
              <li><a href="connect.html">Связь с автором</a></li>
          </ul>
      </nav>
      <div class="heading">
          <h1>CURRENT EXCHANGE RATE</h1>
      </div>
      <div class="row">

          <section class="col-md-24">
              <div class="jumbotron">
                  <blockquote>
                      <p>
                          &ldquo;Люди считают, что программирование — это наука избранных, но в реальности все наоборот — просто много людей создают программы, которые используют чужие программы, как-будто строя стену из маленьких кирпичиков.&rdquo;
                      </p>
                      <small>Donald Knuth</small>
                  </blockquote>
              </div>
              <div class = "text-success">
                  <table id="currency-table" class="table table-hover table-bordered" >
                      <thead>
                      <tr>
                          <th>Bank</th>
                          <th>USD buy</th>
                          <th>USD sale</th>
                          <th>EUR buy</th>
                          <th>EUR sale</th>
                      </tr>
                      </thead>
                      <tbody>
                      <tr>
                          <td>PrivatBank</td>
                          <td><%=GetFromDB.getUSDbuy(1)%></td>
                          <td><%=GetFromDB.getUSDsell(1)%></td>
                          <td><%=GetFromDB.getEURbuy(1)%></td>
                          <td><%=GetFromDB.getEURsell(1)%></td>


                      </tr>
                      <tr>
                          <td>PravexBank</td>
                          <td><%=GetFromDB.getUSDbuy(2)%></td>
                          <td><%=GetFromDB.getUSDsell(2)%></td>
                          <td><%=GetFromDB.getEURbuy(2)%></td>
                          <td><%=GetFromDB.getEURsell(2)%></td>
                      </tr>
                      <tr>
                          <td>KhreshatykBank</td>
                          <td><%=GetFromDB.getUSDbuy(3)%></td>
                          <td><%=GetFromDB.getUSDsell(3)%></td>
                          <td><%=GetFromDB.getEURbuy(3)%></td>
                          <td><%=GetFromDB.getEURsell(3)%></td>
                      </tr>
                      <tr>
                          <td>CityCommerceBank</td>
                          <td><%=GetFromDB.getUSDbuy(4)%></td>
                          <td><%=GetFromDB.getUSDsell(4)%></td>
                          <td><%=GetFromDB.getEURbuy(4)%></td>
                          <td><%=GetFromDB.getEURsell(4)%></td>
                      </tr>
                      <tbody>
                  </table>


              </div>

              <h2>USED TECHNOLOGIES</h2>
              <div class="team">
                  <div class="row">
                      <div class="col col-md-4">
                          <img src="images/technologies/developer.jpg" alt="John Doe" class="thumbnail">
                          <div class="caption">
                              <h3>Roman Mykhailenko</h3>
                              <p>developer</p>
                          </div>
                      </div>
                      <div class="col col-md-4 col-md-offset-1">
                          <img src="images/technologies/hibernate.jpg" alt="Saundra Pittsley" class="thumbnail">
                          <div class="caption">
                              <h3>Hibernate</h3>
                              <p>technology</p>
                          </div>
                      </div>
                      <div class="col col-md-4 col-md-offset-1">
                          <img src="images/technologies/bootstrap.jpg" alt="Julio Simser" class="thumbnail">
                          <div class="caption">
                              <h3>Bootstrap</h3>
                              <p>framework</p>
                          </div>
                      </div>
                      <div class="col col-md-4 col-md-offset-1">
                          <img src="images/technologies/spring.jpg" alt="Margery Venuti" class="thumbnail">
                          <div class="caption">
                              <h3>Spring</h3>
                              <p>framework</p>
                          </div>
                      </div>
                      <div class="col col-md-4 col-md-offset-1">
                          <img src="images/technologies/idea.jpg" alt="Fernando Tondrea" class="thumbnail">
                          <div class="caption">
                              <h3>Intelij IDEA</h3>
                              <p>ide</p>
                          </div>
                      </div>
                  </div>
                  <div class="row">
                      <div class="col col-md-4">
                          <img src="images/technologies/tomcat.jpg" alt="Ericka Nobriga" class="thumbnail">
                          <div class="caption">
                              <h3>Tomcat</h3>
                              <p>apache</p>
                          </div>
                      </div>
                      <div class="col col-md-4 col-md-offset-1">
                          <img src="images/technologies/sublime.jpg" alt="Cody Rousselle" class="thumbnail">
                          <div class="caption">
                              <h3>Sublime Text</h3>
                              <p>text redactor</p>
                          </div>
                      </div>
                      <div class="col col-md-4 col-md-offset-1">
                          <img src="images/technologies/mysql.jpg" alt="Erik Wollman" class="thumbnail">
                          <div class="caption">
                              <h3>MySQL</h3>
                              <p>database</p>
                          </div>
                      </div>
                      <div class="col col-md-4 col-md-offset-1">
                          <img src="images/technologies/html5.jpg" alt="Dona Shoff" class="thumbnail">
                          <div class="caption">
                              <h3>html5</h3>
                              <p>HyperText Markup Language</p>
                          </div>
                      </div>
                      <div class="col col-md-4 col-md-offset-1">
                          <img src="images/technologies/css.jpg" alt="Darryl Brunton" class="thumbnail">
                          <div class="caption">
                              <h3>CSS3</h3>
                              <p>lCascading Style Sheets</p>
                          </div>
                      </div>
                  </div>
              </div>
          </section>
      </div>
  </div>
  <footer>
      <div class="container">
          <div class="row">
              <div class="col-md-8 twitter">
                  <h3>Twitter feed</h3>
                  <time datetime="2012-10-23"><a href="#">23 oct</a></time>
                  <p>
                      In ultricies pellentesque massa a porta. Aliquam ipsum enim, hendrerit ut porta nec, ullamcorper et nulla. In eget mi dui, sit amet scelerisque nunc. Aenean aug
                  </p>
              </div>
              <div class="col-md-4 sitemap">
                  <h3>Sitemap</h3>
                  <div class="row">
                      <div class="col-md-12">
                          <a href="about.html">Home</a>
                          <a href="about.html">About</a>
                          <a href="currency.jsp">Currency</a>
                      </div>
                      <div class="col-md-12">
                          <a href="ukrbanks.html">Banks</a>
                          <a href="author.html">Author</a>
                          <a href="connect.html">Contact</a>
                      </div>
                  </div>
              </div>
              <div class="col-md-4 social">
                  <h3>Social networks</h3>
                  <a href="http://twitter.com/" class="social-icon twitter"></a>
                  <a href="http://facebook.com/" class="social-icon facebook"></a>
                  <a href="http://plus.google.com/" class="social-icon google-plus"></a>
                  <a href="http://vimeo.com/" class="social-icon-small vimeo"></a>
                  <a href="http://youtube.com/" class="social-icon-small youtube"></a>
                  <a href="http://flickr.com/" class="social-icon-small flickr"></a>
                  <a href="http://instagram.com/" class="social-icon-small instagram"></a>
                  <a href="/rss/" class="social-icon-small rss"></a>
              </div>
              <div class="col-md-8 footer-logo">
                  <a href="/"><img src="images/footer-logo.png" alt="Whitesquare logo"></a>
                  <p>
                      Copyright &copy; 2012 Whitesquare. A
                      <a href="http://pcklab.com">pcklab</a> creation
                  </p>
              </div>
          </div>
      </div>
  </footer>






  </body>
</html>