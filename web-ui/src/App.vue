<template>
    <div id="app" class="viewport">
        <md-whiteframe md-elevation="3">
            <md-toolbar class="toolbar">
                <md-button class="md-icon-button">
                    <md-icon>menu</md-icon>
                </md-button>
                <router-link to="/home">
                    <md-button class="md-icon-button">
                        <md-icon>book</md-icon>
                    </md-button>
                </router-link>
                <h2 class="md-title" style="flex: 1">Bookflix</h2>
                <router-link to="/login">
                    <md-button>Login</md-button>
                </router-link> 
            </md-toolbar>
        </md-whiteframe>

        <router-view></router-view>
    </div>
</template>

<script>
export default {
  name: 'app'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
 toolbar{
        background-color: #3F657A;
    }
    body{
        background-color: #e1e0e0;
    }
     a {
        color:  white;
    }
</style>
