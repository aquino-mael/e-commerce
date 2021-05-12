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
    <title>Novo Produto</title>
</head>

<body class="bg-dark">
    <div class="row px-2 mx-auto" style="height: 90vh;">
        <div class="d-flex justify-content-center align-items-center flex-column">
            <div class="card mx-auto bg-dark ">
                <div class="card-body bg-dark text-white">
                    <h1 class="card-title text-center mb-4">Novo Produto</h1>
                    <div class="card-text">
                        <form class="p-2" align="start" action="RegisterProduct" method="POST">
                            <label class="mb-2" for="inputName">Nome do Produto</label>
                            <input type="text"
                                class="form-control form-control-sm mb-4 bg-transparent text-white"
                                id="inputName"
                                placeholder="nome"
                                name="name"
                                required
                            >
                            <label class="mb-2" for="inputPrice">Valor do produto</label>
                            <input type="text"
                                class="form-control form-control-sm mb-4 bg-transparent text-white"
                                id="inputPrice"
                                placeholder="Valor (R$)"
                                name="price"
                                required
                            >
                            <label class="mb-2" for="inputType">Tipo</label>
                            <input type="text"
                                class="form-control form-control-sm mb-4 bg-transparent text-white"
                                id="inputType"
                                placeholder="Tipo"
                                name="type"
                                required
                            >
                            <label class="mb-2" for="inputSize">Tamanho</label>
                            <input type="text"
                                class="form-control form-control-sm mb-4 bg-transparent text-white"
                                id="inputSize"
                                placeholder="Tamanho"
                                name="size"
                                required
                            >
                            <label class="mb-2" for="inputColor">Cor</label>
                            <input type="text"
                                class="form-control form-control-sm mb-4 bg-transparent text-white"
                                id="inputColor"
                                placeholder="Cor"
                                name="color"
                                required
                            >
                            <label class="mb-2" for="inputStatus">Status</label>
                            <input type="text"
                                class="form-control form-control-sm mb-4 bg-transparent text-white"
                                id="inputStatus"
                                placeholder="Status"
                                name="status"
                                required
                            >
                            <div class="d-grid gap-2">
                            <button type="submit" class="btn btn-outline-secondary btn-blcok mt-2">Criar Produto</button>
                            </div>
                        </form>
                        <a href="/e-commerce/dashboard.jsp" class="text-decoration-none">
                       <div class="d-grid gap-2">
                       <button class="btn btn-outline-secondary btn-blcok mt-2">Cancelar</button>
                       </div>
                       </a>
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
