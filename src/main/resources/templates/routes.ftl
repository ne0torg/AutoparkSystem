<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="/css/style.css" type="text/css">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-inverse navbar-global navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Система управления автопарком</a>
        </div>
    </div>
</nav>
<nav class="navbar-primary">

    <ul class="navbar-primary-menu">
        <li>
            <a href="/routes"><span class="nav-label">Маршруты</span></a>
            <a href="/auto"><span class="nav-label">Автомобили</span></a>
            <a href="/driver"><span class="nav-label">Водители</span></a>
            <a href="/owner"><span class="nav-label">Собственники</span></a>
            <a href="/repair"><span class="nav-label">Ремонт</span></a>
        </li>
    </ul>
</nav>
<div class="main-content">

    <a href="/addRoute">Новый маршрут</a>
    <table class="table table-hover">
        <thead class="thead-light">
        <tr>
            <th scope="col">id</th>
            <th scope="col">Номер маршрута</th>
            <th scope="col">Начало маршрута</th>
            <th scope="col">Конец маршрута</th>
            <th scope="col">Стоимость поездки<th>
            <th scope="col">Дневной план<th>
        </tr>
        </thead>
        <tbody>
            <#list listRoutes as route>
                <tr>
                    <th scope="col">${route.id}</th>
                    <th scope="col">${route.routeNumber}</th>
                    <th scope="col">${route.routeStart}</th>
                    <th scope="col">${route.routeFinish}</th>
                    <th scope="col">${route.routeDayPrice}</th>
                    <th scope="col">${route.routeDayPlan}</th>
                </tr>
            </#list>
        </tbody>
    </table>
</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>