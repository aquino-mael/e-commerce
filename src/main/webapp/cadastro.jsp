<%@ page language="java" contentType="text/html; charset=utf=8" pageEncoding="utf-8"%>
<!DOCTYPE html/>
<html lang="pt-Br">

    <head>

        <!-- font -->
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Comfortaa&display=swap" rel="stylesheet">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">

        <link rel="stylesheet" href="./css/login.css">    

        <title>Cadastro</title>
    </head>
    <body>
        <div class="global-container">
            <div class="card cadastro-form">
                <div class="card-body">
                    <h1 class="card-title text-center">CADASTRO</h1>
                    <div class="card-text">
                        <form action="RegisterClient" method="post">
                            <div class="form-group">

                                <label for="inputNome">Nome</label>
                                <input type="text"
                                name="name"
                                class="form-control form-control-sm"
                                id="inputNome"
                                required>

                                <label for="inputEmail">Email</label>
                                <input type="email"
                                name="email"
                                class="form-control form-control-sm"
                                id="inputEmail"
                                required>

                                <label for="inputTel">Telefone</label>
                                <input type="tel"
                                name="phone"
                                class="form-control form-control-sm"
                                id="inputTel"
                                maxlength="17"
                                required>

                                <label for="inputRua">Rua</label>
                                <input type="text"
                                name="street"
                                class="form-control form-control-sm"
                                id="inputRua"
                                required>

                                <label for="inputNum">Número da casa</label>
                                <input type="number"
                                name="number"
                                class="form-control form-control-sm"
                                id="inputNum"
                                required>

                                <label for="inputBairro">Bairro</label>
                                <input type="text"
                                name="district"
                                class="form-control form-control-sm"
                                id="inputBairro"
                                required>

                                <label for="inputCep">CEP</label>
                                <input type="tel"
                                name="zipCode"
                                class="form-control form-control-sm"
                                id="inputCep"
                                maxlength="8"
                                required>

                                <label for="inputUf">UF</label>
                                <input type="text"
                                name="uf"
                                class="form-control form-control-sm"
                                id="inputUf"
                                maxlength="2"
                                required>

                                <label for="inputPassword">Senha</label>
                                <input type="password"
                                name="password"
                                class="form-control form-control-sm"
                                id="inputPassword"
                                required>

                                <button type="submit" class="btn btn-primary btn-block">CADASTRAR</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- Optional JavaScript; choose one of the two! -->

        <!-- Option 1: Bootstrap Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"
            crossorigin="anonymous"></script>
    </body>

</html>