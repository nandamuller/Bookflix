<template>
    <div class="autor-bkf">
        <md-card md-elevation="0">
              <md-card-content>
                  <div>"{{ obra.titulo }}"</div>
              </md-card-content>
        </md-card>
    </div>
</template>

<script>
    export default {
        name: 'Obra', 

     props: {
         obra: {
             type: Object,
             required: true
         }
     },
     
     created() {
         console.log(this.obra.id);
     },
     
  methods: {
  }
};
</script>

<style>
    
</style>