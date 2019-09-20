<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/js/bootstrap.min.js"
        integrity="sha384-a5N7Y/aK3qNeh15eJKGWxsqtnX/wWdSZSKp+81YjTmS15nvnvxKHuzaWwXHDli+4"
        crossorigin="anonymous"></script>

<body>

<div class="row align-items-center justify-content-center" >
        <form name="user" action="test" method="post" style="background-color: deepskyblue">
            <legend>Add User</legend>
            <div class="form-group" align="left">
                <label for="name">Name</label>
                <input id="name" type="text" name="name" />
            </div>
            <div class="form-group" align="left">
                <label for="lastName">Last name</label>
                <input id="lastName" type="text" name="lastName" />
            </div>
            <input type="submit" value="   Register   " />
        </form>
    </div>

    <#if  model["users"]?has_content>
    <div class="container">
        <table class="table table-dark table-striped">
            <tr>
                <th>Name</th>
                <th>Last Name</th>
            </tr>
            <#list model["users"]! as user>
               <tr>
                  <td>${user.name!"null or missing"}</td>
                  <td>${user.lastName!"null or missing"}</td>
               </tr>
            </#list>
        </table>
    </#if>
    </div>
</body>
</html>