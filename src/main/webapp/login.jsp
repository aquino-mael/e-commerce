<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!doctype html>
<html lang="pt-br">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <title>Login</title>
</head>

<body class="bg-dark">
    <div class="row px-2 mx-auto" style="height: 90vh;">
        <div class="d-flex justify-content-center align-items-center flex-column">
            <div class="card mx-auto bg-dark ">
                <div class="card-body bg-dark text-white">
                    <h1 class="card-title text-center mb-4">Login</h1>
                    <div class="card-text">
                        <form class="p-2" align="start" action="login" method="POST">
                            <label class="mb-2" for="inputEmail">Email</label><br>
                            <input type="email"
                                class="form-control form-control-sm mb-4 bg-transparent text-white"
                                id="inputEmail"
                                placeholder="Insira seu email"
                                name="email"
                                required
                            >
                            <label class="mb-2" for="inputPassword">Senha</label>
                            <input type="password"
                                class="form-control form-control-sm mb-4 bg-transparent text-white"
                                id="inputPasword"
                                placeholder="Insira sua senha"
                                name="password"
                                required
                            >
                            <p>Não possui uma conta? <a href="./register.jsp" class="text-decoration-none">Cadastre-se</a></p>
                            <div class="d-grid gap-2">
                            <button type="submit" class="btn btn-secondary btn-block mt-2">Entrar</button>
                            </div>
                        </form>
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