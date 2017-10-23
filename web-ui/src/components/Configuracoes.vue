<template>
    <md-whiteframe>
        <md-card class="bkf-conheca" style="min-height: 70vh;">
            <md-card-header>
                <md-card-header-text>
                    <div class="md-title"><h1>Configurações</h1></div>
                </md-card-header-text>
            </md-card-header>

            <md-card-content class="bkf-conf">
                <div>
                    <h1>
                       Sua conta 
                    </h1>
                <div>
                    <p>Altere seu e-mail:</p>
                    <input type="email"><span class="highlight"></span><span class="bar"></span>
                </div>
                <div>
                    <p>Altere sua senha:</p>
                    <input type="password"><span class="highlight"></span><span class="bar"></span>
                </div>
                </div>
            </md-card-content>
        </md-card>
    </md-whiteframe>
</template>

<script>
    export default {
        data () {
            return {
            }
        },
        components: {
        }
    }
</script>

<style>
     .bkf-conheca{
        margin:150px;
        margin-top: 0px;
    }
    .bkf-conf{
        
    }
</style>