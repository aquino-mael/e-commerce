<%@ page language="java" contentType="text/html; charset=utf=8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <title>Home</title>
</head>

<body class="bg-dark">
    <header class="bg-image"
        style="background-image: url('https://soulsergios.com.br/wp-content/uploads/2018/03/home-banner-divinopolis-moda-masculina.jpg');background-position: top center;background-repeat: no-repeat;background-size: cover;min-height: 40vh;">

        <!-- NavBar Menu -->

        <nav class="navbar navbar-expand-md navbar-dark">
            <div class="container-fluid px-4">
                <a class="navbar-brand" href="https://github.com/aquino-mael/e-commerce">: ) logo</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">
                                <svg xmlns="http://www.w3.org/2000/svg" width="17" height="17" fill="currentColor"
                                    class="bi bi-house" viewBox="0 0 16 19">
                                    <path fill-rule="evenodd"
                                        d="M2 13.5V7h1v6.5a.5.5 0 0 0 .5.5h9a.5.5 0 0 0 .5-.5V7h1v6.5a1.5 1.5 0 0 1-1.5 1.5h-9A1.5 1.5 0 0 1 2 13.5zm11-11V6l-2-2V2.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5z" />
                                    <path fill-rule="evenodd"
                                        d="M7.293 1.5a1 1 0 0 1 1.414 0l6.647 6.646a.5.5 0 0 1-.708.708L8 2.207 1.354 8.854a.5.5 0 1 1-.708-.708L7.293 1.5z" />
                                </svg>
                                InÃ­cio
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">
                                <svg xmlns="http://www.w3.org/2000/svg" width="17" height="17" fill="currentColor"
                                    class="bi bi-list-ul" viewBox="0 0 16 19">
                                    <path fill-rule="evenodd"
                                        d="M5 11.5a.5.5 0 0 1 .5-.5h9a.5.5 0 0 1 0 1h-9a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h9a.5.5 0 0 1 0 1h-9a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h9a.5.5 0 0 1 0 1h-9a.5.5 0 0 1-.5-.5zm-3 1a1 1 0 1 0 0-2 1 1 0 0 0 0 2zm0 4a1 1 0 1 0 0-2 1 1 0 0 0 0 2zm0 4a1 1 0 1 0 0-2 1 1 0 0 0 0 2z" />
                                </svg>
                                Categorias
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">
                                <svg xmlns="http://www.w3.org/2000/svg" width="17" height="17" fill="currentColor"
                                    class="bi bi-bag" viewBox="0 0 16 19">
                                    <path
                                        d="M8 1a2.5 2.5 0 0 1 2.5 2.5V4h-5v-.5A2.5 2.5 0 0 1 8 1zm3.5 3v-.5a3.5 3.5 0 1 0-7 0V4H1v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V4h-3.5zM2 5h12v9a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V5z" />
                                </svg>
                                Sacola
                            </a>
                        </li>
                    </ul>   
                    <form class="d-flex me-3">
                        <input class="form-control bg-transparent text-white me-2" type="search"
                            placeholder="Pesquise aqui" aria-label="Search">
                        <button class="btn btn-outline-light" type="submit">
                            <svg xmlns="http://www.w3.org/2000/svg" width="17" height="17" fill="currentColor"
                                class="bi bi-search" viewBox="0 0 16 18">
                                <path
                                    d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z" />
                            </svg>
                        </button>
                    </form>
                    <a class="nav-link text-white" href="#">
                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-box-arrow-in-left" viewBox="0 0 16 16">
                            <path
                                fill-rule="evenodd" d="M10 3.5a.5.5 0 0 0-.5-.5h-8a.5.5 0 0 0-.5.5v9a.5.5 0 0 0 .5.5h8a.5.5 0 0 0 .5-.5v-2a.5.5 0 0 1 1 0v2A1.5 1.5 0 0 1 9.5 14h-8A1.5 1.5 0 0 1 0 12.5v-9A1.5 1.5 0 0 1 1.5 2h8A1.5 1.5 0 0 1 11 3.5v2a.5.5 0 0 1-1 0v-2z" />
                            <path
                                fill-rule="evenodd" d="M4.146 8.354a.5.5 0 0 1 0-.708l3-3a.5.5 0 1 1 .708.708L5.707 7.5H14.5a.5.5 0 0 1 0 1H5.707l2.147 2.146a.5.5 0 0 1-.708.708l-3-3z" />
                        </svg>
                        Login
                    </a>
                </div>
            </div>
        </nav>

        <!-- Apresentation Container -->

        <div class="container-fluid p-5">
            <div class="jumbotron text-white">
                <h1 class="display-3">Call to action</h1>
                <p class="lead">
                    <% out.println("default phrase"); %>
                </p>
                <p class="lead mt-5">
                    <a class="btn btn-secondary btn-lg" href="Jumbo action link" role="button">Button</a>
                </p>
            </div>
        </div>
    </header>

    <!-- Grid Products -->

    <div class="py-5">
        <div class="container">
            <div class="row hidden-md-up">
                <div class="col-md-3 col-sm-6 col-6 mb-4">
                    <div class="card bg-transparent text-white">
                        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5qHGwsrobSFmmaDyZHs9NP_cWtGCLPF25Pg&usqp=CAU"
                            class="card-img-top img-fluid img-thumbnail rounded mx-auto d-block" alt="..."
                            style="max-width: 20em;">
                        <div class="card-body">
                            <h6 class="card-title text-center">Camisa preta</h6>
                            <p class="card-text text-center text-muted"><small>#black #heart #cristian</small></p>
                            <p class="text-center">
                                <a href="#" class="btn btn-transparent text-white">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="17" height="17" fill="currentColor"
                                        class="bi bi-bag" viewBox="0 0 16 19">
                                        <path
                                            d="M8 1a2.5 2.5 0 0 1 2.5 2.5V4h-5v-.5A2.5 2.5 0 0 1 8 1zm3.5 3v-.5a3.5 3.5 0 1 0-7 0V4H1v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V4h-3.5zM2 5h12v9a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V5z" />
                                    </svg>
                                    &nbsp;Adicionar
                                </a>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 col-6 mb-4">
                    <div class="card bg-transparent text-white">
                        <img src="./assets/camisa-1.png"
                            class="card-img-top img-fluid rounded mx-auto d-block" alt="..."
                            style="max-width: 18em;">
                        <div class="card-body p-0">
                            <h6 class="card-title text-center">Camisa preta</h6>
                            <p class="card-text text-center text-muted"><small>#black #heart #cristian</small></p>
                            <p class="text-center">
                                <a href="#" class="btn btn-transparent text-white">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="17" height="17" fill="currentColor"
                                        class="bi bi-bag" viewBox="0 0 16 19">
                                        <path
                                            d="M8 1a2.5 2.5 0 0 1 2.5 2.5V4h-5v-.5A2.5 2.5 0 0 1 8 1zm3.5 3v-.5a3.5 3.5 0 1 0-7 0V4H1v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V4h-3.5zM2 5h12v9a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V5z" />
                                    </svg>
                                    &nbsp;Adicionar
                                </a>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 col-6 mb-4">
                    <div class="card bg-transparent text-white">
                        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5qHGwsrobSFmmaDyZHs9NP_cWtGCLPF25Pg&usqp=CAU"
                            class="card-img-top img-fluid img-thumbnail rounded mx-auto d-block" alt="..."
                            style="max-width: 20em;">
                        <div class="card-body">
                            <h6 class="card-title text-center">Camisa preta</h6>
                            <p class="card-text text-center text-muted"><small>#black #heart #cristian</small></p>
                            <p class="text-center">
                                <a href="#" class="btn btn-transparent text-white">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="17" height="17" fill="currentColor"
                                        class="bi bi-bag" viewBox="0 0 16 19">
                                        <path
                                            d="M8 1a2.5 2.5 0 0 1 2.5 2.5V4h-5v-.5A2.5 2.5 0 0 1 8 1zm3.5 3v-.5a3.5 3.5 0 1 0-7 0V4H1v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V4h-3.5zM2 5h12v9a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V5z" />
                                    </svg>
                                    &nbsp;Adicionar
                                </a>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 col-6 mb-4">
                    <div class="card bg-transparent text-white">
                        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5qHGwsrobSFmmaDyZHs9NP_cWtGCLPF25Pg&usqp=CAU"
                            class="card-img-top img-fluid img-thumbnail rounded mx-auto d-block" alt="..."
                            style="max-width: 20em;">
                        <div class="card-body">
                            <h6 class="card-title text-center">Camisa preta</h6>
                            <p class="card-text text-center text-muted"><small>#black #heart #cristian</small></p>
                            <p class="text-center">
                                <a href="#" class="btn btn-transparent text-white">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="17" height="17" fill="currentColor"
                                        class="bi bi-bag" viewBox="0 0 16 19">
                                        <path
                                            d="M8 1a2.5 2.5 0 0 1 2.5 2.5V4h-5v-.5A2.5 2.5 0 0 1 8 1zm3.5 3v-.5a3.5 3.5 0 1 0-7 0V4H1v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V4h-3.5zM2 5h12v9a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V5z" />
                                    </svg>
                                    &nbsp;Adicionar
                                </a>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-3 col-sm-6 col-6 mb-4">
                    <div class="card bg-transparent text-white">
                        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5qHGwsrobSFmmaDyZHs9NP_cWtGCLPF25Pg&usqp=CAU"
                            class="card-img-top img-fluid img-thumbnail rounded mx-auto d-block" alt="..."
                            style="max-width: 20em;">
                        <div class="card-body">
                            <h6 class="card-title text-center">Camisa preta</h6>
                            <p class="card-text text-center text-muted"><small>#black #heart #cristian</small></p>
                            <p class="text-center">
                                <a href="#" class="btn btn-transparent text-white">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="17" height="17" fill="currentColor"
                                        class="bi bi-bag" viewBox="0 0 16 19">
                                        <path
                                            d="M8 1a2.5 2.5 0 0 1 2.5 2.5V4h-5v-.5A2.5 2.5 0 0 1 8 1zm3.5 3v-.5a3.5 3.5 0 1 0-7 0V4H1v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V4h-3.5zM2 5h12v9a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V5z" />
                                    </svg>
                                    &nbsp;Adicionar
                                </a>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 col-6 mb-4">
                    <div class="card bg-transparent text-white">
                        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5qHGwsrobSFmmaDyZHs9NP_cWtGCLPF25Pg&usqp=CAU"
                            class="card-img-top img-fluid img-thumbnail rounded mx-auto d-block" alt="..."
                            style="max-width: 20em;">
                        <div class="card-body">
                            <h6 class="card-title text-center">Camisa preta</h6>
                            <p class="card-text text-center text-muted"><small>#black #heart #cristian</small></p>
                            <p class="text-center">
                                <a href="#" class="btn btn-transparent text-white">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="17" height="17" fill="currentColor"
                                        class="bi bi-bag" viewBox="0 0 16 19">
                                        <path
                                            d="M8 1a2.5 2.5 0 0 1 2.5 2.5V4h-5v-.5A2.5 2.5 0 0 1 8 1zm3.5 3v-.5a3.5 3.5 0 1 0-7 0V4H1v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V4h-3.5zM2 5h12v9a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V5z" />
                                    </svg>
                                    &nbsp;Adicionar
                                </a>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 col-6 mb-4">
                    <div class="card bg-transparent text-white">
                        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5qHGwsrobSFmmaDyZHs9NP_cWtGCLPF25Pg&usqp=CAU"
                            class="card-img-top img-fluid img-thumbnail rounded mx-auto d-block" alt="..."
                            style="max-width: 20em;">
                        <div class="card-body">
                            <h6 class="card-title text-center">Camisa preta</h6>
                            <p class="card-text text-center text-muted"><small>#black #heart #cristian</small></p>
                            <p class="text-center">
                                <a href="#" class="btn btn-transparent text-white">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="17" height="17" fill="currentColor"
                                        class="bi bi-bag" viewBox="0 0 16 19">
                                        <path
                                            d="M8 1a2.5 2.5 0 0 1 2.5 2.5V4h-5v-.5A2.5 2.5 0 0 1 8 1zm3.5 3v-.5a3.5 3.5 0 1 0-7 0V4H1v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V4h-3.5zM2 5h12v9a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V5z" />
                                    </svg>
                                    &nbsp;Adicionar
                                </a>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 col-6 mb-4">
                    <div class="card bg-transparent text-white">
                        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5qHGwsrobSFmmaDyZHs9NP_cWtGCLPF25Pg&usqp=CAU"
                            class="card-img-top img-fluid img-thumbnail rounded mx-auto d-block" alt="..."
                            style="max-width: 20em;">
                        <div class="card-body">
                            <h6 class="card-title text-center">Camisa preta</h6>
                            <p class="card-text text-center text-muted"><small>#black #heart #cristian</small></p>
                            <p class="text-center">
                                <a href="#" class="btn btn-transparent text-white">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="17" height="17" fill="currentColor"
                                        class="bi bi-bag" viewBox="0 0 16 19">
                                        <path
                                            d="M8 1a2.5 2.5 0 0 1 2.5 2.5V4h-5v-.5A2.5 2.5 0 0 1 8 1zm3.5 3v-.5a3.5 3.5 0 1 0-7 0V4H1v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V4h-3.5zM2 5h12v9a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V5z" />
                                    </svg>
                                    &nbsp;Adicionar
                                </a>
                            </p>
                        </div>
                    </div>
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