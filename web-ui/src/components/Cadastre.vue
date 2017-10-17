<template>
    <md-whiteframe>
        <md-card class="bkf-conheca">
            <md-card-header>
                <md-card-header-text>
                    <div class="md-title">Cadastre</div>
                </md-card-header-text>
            </md-card-header>
            <md-card-content>
                <form novalidate @submit.stop.prevent="submit">
                                <md-input-container>
                                <label>Nome</label>
                                <md-input v-model="initialValue"></md-input>
                                </md-input-container>

                                <md-input-container>
                                    <label>E-mail</label>
                                    <md-input v-model="initialValue"></md-input>
                                </md-input-container>

                                <md-input-container>
                                    <label>Senha</label>
                                    <md-input type="password"></md-input>
                                </md-input-container>
                            </form> 
                <md-button class="md-raised md-primary">Confirma</md-button>
            </md-card-content>
        </md-card>
    </md-whiteframe>
</template>

<script>

</script>

<style>
    .bkf-conheca{
        margin:150px;
        margin-top: 0px;
    }
</style>
