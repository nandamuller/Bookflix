<template>
     <md-whiteframe>
        <md-card class="bkf-conheca" style="min-height: 70vh;">
            <md-layout style="margin: 20px;">
            <md-layout md-column md-flex-xsmall="100" md-flex-small="100" md-flex-medium="100">
                <div class="bkf-header"><h2>Login</h2></div>
                <md-whiteframe class="bkf-login">
                    <md-card>
                        <div class="bkf">
                            <md-input-container type="name">
                                <label>User</label>
                                <md-textarea></md-textarea>
                            </md-input-container>
                            <md-input-container type="password">
                                <label>Senha</label>
                                <md-textarea></md-textarea>
                            </md-input-container>
                            <md-button class="md-raised md-primary">Entrar</md-button>
                        </div>
                    </md-card>
                </md-whiteframe>
        </md-layout>
    </md-layout>
        </md-card>
    </md-whiteframe>
</template>

<script>
    export default {
        data() {
            return {}
        },
        components: {}
    }

</script>

<style>
    .bkf-conheca {
        margin: 20px;
    }
    .bkf-login{
        margin-left: 175px;
        margin-right: 175px;
        margin-bottom: 100px;
    }
    .bkf{
        margin:20px;
    }
</style>
