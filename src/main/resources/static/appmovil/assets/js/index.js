const { createApp } = Vue
createApp({
  data() {
    return {
      productos:[],
      productoscompletos:[],
      departamentos:[],
      urlproducto:'/api/productos',
      // buscador:'',
      // buyer:'',
      // urlCurrent:"/api/buyer/current",
      // error: "",

    }
  },
  created() {

    this.obtenerProductos(this.urlproducto)
    // this.clienteAutenticado(this.urlCurrent)
    

  },

  methods: {

    obtenerProductos(URL){
      axios.get(URL)
      .then(response => {
          this.productos= response.data
          this.productoscompletos = this.productos

          this.productos.forEach(producto => {  

            if(!this.departamentos.includes(producto .departamento)){
              this.departamentos.push(producto .departamento)};
        })
        })

          },

        /*  clienteAutenticado(URL){
            axios.get(URL)
            .then(response => {
              this.buyer = response.data
            
            })
      
          },*/

      /*    agregarAlCarrito(id){
         if(this.buyer != 0){
            let variable1 = this.phonesCompletos.filter(phone => phone.id == id)
            console.log(variable1);
            let ticketPhoneCart = {
              stocks:[1],
              phonesId:[id],
              color: variable1[0].phoneImageAndColorDTOS[0].phoneColor
            }
            axios.post('/api/ticket/phone/cart', ticketPhoneCart)
            Swal.fire({
              background:'#dc1d1d',
              color:'white',
              position: 'top-end',
              title: 'You have added a product to the cart',
              showConfirmButton: false,
              timer: 1500, 
            }).then(response => console.log('supuestamente anda'))
            }else {
                Swal.fire({
                  confirmButtonColor: "#dc1d1d",
                  background: "#0a0a0a",
                  color: "white",
                  text: "You should SIGN IN or SIGN UP to continue",
                }).then(() => window.location.href="/web/login.html")
              } 
           
          
          },*/
    
         
    
  },

  computed:{
 
  }
}).mount('#app')