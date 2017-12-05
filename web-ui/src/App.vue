<template>
    <div id="app" class="viewport">
        <md-whiteframe md-elevation="3">
            <md-toolbar class="toolbar">
                <md-button class="md-icon-button" @click="toggleLeftSidenav">
                    <md-icon>menu</md-icon>
                </md-button>
                <h2 class="md-title" style="flex: 1">Bookflix</h2>
            </md-toolbar>
        </md-whiteframe>
            <md-sidenav class="md-left" ref="leftSidenav" @open="open('Left')" @close="close('Left')">
                <md-toolbar>
                    <div>Menu</div>
                </md-toolbar>
                <div>
                    <router-link to="/home">
                        <p>Home</p>
                    </router-link>
                    <router-link to="/trecho-do-dia">
                        <p>Trecho</p>
                    </router-link>
                    <router-link to="/biblioteca">
                        <p>Biblioteca</p>
                    </router-link>
                </div>
        </md-sidenav>

        <router-view></router-view>
    </div>
</template>

<script>    
export default {
    name: 'app',
    methods: {
        toggleLeftSidenav() {
            this.$refs.leftSidenav.toggle();
        },
        open(ref) {
            console.log('Opened: ' + ref);
        },
        close(ref) {
            console.log('Closed: ' + ref);
        }
    }
};
</script>

<style>
#app {
  font-family: 'Montserrat', sans-serif;
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
