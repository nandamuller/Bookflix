<template>
    <md-whiteframe>
        <md-layout>
            <h2>Cadastre-se!</h2>
        </md-layout>
            <div>
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
        </div>
        <div>
            <md-button class="md-raised md-primary">Confirma</md-button>
        </div>
    </md-whiteframe>
</template>

<script>

</script>

<style>
    
</style>
