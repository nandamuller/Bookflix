<template>
    <md-whiteframe>
        <md-layout md-gutter="25">
            <md-layout md-flex-xsmall="50">
                <md-whiteframe md-tag="section" md-elevation="0">
                    <div style="margin: 15px;">
                        <router-link to="/conheca">
                            <img src="../assets/book2.png" alt="Skyscraper" />
                            <div class="md-title bkf-card-title" >
                                <h2>Conheça</h2>
                            </div>
                        </router-link>
                    </div>
                </md-whiteframe>
            </md-layout >


            <md-layout md-flex-xsmall="50" md-flex-small="100" md-flex-medium="100">
                <md-whiteframe md-tag="section" md-elevation="0">
                    <div style="margin: 15px" >
                        <router-link to="/trecho-do-dia">
                            <img src="../assets/book.png" alt="Skyscraper" />
                            <div class="md-title bkf-card-title" >
                                <h2>Trecho do Dia</h2>
                            </div>
                        </router-link>
                    </div>
                </md-whiteframe>
            </md-layout>
        </md-layout>

            <md-layout md-flex-xsmall="50" class="bkf-bilb">
                <md-whiteframe md-tag="section" md-elevation="0">
                    <div style="margin: 15px" >
                        <router-link to="/biblioteca">
                            <img src="../assets/book4.png" alt="Skyscraper" />
                            <div class="md-title bkf-card-title" >
                                <h2>Biblioteca</h2>
                            </div>
                        </router-link>
                    </div>
                </md-whiteframe>
            </md-layout>
        
    </md-whiteframe>    
</template>


<script>


</script>

<style>
    .bkf-bilb{
    }
    .bkf-card-title {
        position: absolute; 
        top: 150px; 
        text-align: center; 
        width: 100%;
        font-size: 24px; 
    }
    
    .bkf-card-title h2 {
        text-shadow: 2px 2px 1px #777;
    }
</style>
