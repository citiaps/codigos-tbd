<template>
    <div>
    <h1>Todos los perros</h1>
    <ul class="item-list">
      <li v-for="dog in dogs" :key="dog.id">
       <!-- <img :src="'https://loremflickr.com/160/120/dog?lock='+i"/>-->
        {{dog.id}} - {{dog.name}}
      </li>
    </ul>
    <div v-if="dogs.length==0" class="empty-list">
      <em>No se han cargado los datos</em>
    </div>
  </div>
</template>
<script>
export default {
    //Función que contiene los datos del componente
    data(){
        return{
            //Lista de ítems a mostrar
            dogs:[]
        }
    },
    methods:{
        //Función asíncrona para consultar los datos
        getData: async function(){
            try {
                let response = await this.$http.get('/dogs');
                this.dogs  = response.data;
                console.log(response)
            } catch (error) {
                console.log('error', error);
            }
        }
    },
    //Función que se ejecuta al cargar el componente
    created:function(){
        this.getData();
    }
    
}
</script>