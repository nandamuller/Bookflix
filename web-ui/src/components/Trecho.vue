<template>    
    <div class="trecho-bkf">
        <md-card md-elevation="0">
              <md-card-content>
                  <div>"{{ trecho.conteudo }}"</div>
              </md-card-content>
        </md-card>
    </div>
</template>

<script>
    
 export default { 
     name: 'Trecho', 

     props: {
         trecho: {
             type: Object,
             required: true
         }
     },
     
     created() {
         console.log(this.trecho.id);
     },
     
  methods: {
    openDialog(ref) {
      this.$refs[ref].open();
    },
    closeDialog(ref) {
      this.$refs[ref].close();
    },
    onOpen() {
      console.log('Opened');
    },
    onClose(type) {
      console.log('Closed', type);
    }
  }
};
</script>

<style>
    trecho-bkf{
        text-align: center; 
        width: 100%;
        font-size: 24px; 
    }
    .inf-trecho-bkf{
        font-size: 24px;
    }
</style>
