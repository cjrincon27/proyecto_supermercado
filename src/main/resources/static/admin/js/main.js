




const app = Vue.createApp({
    data() {
        return{
            productos:[],
            nombre:"",
            descripcion: "",
            precio: null,
            medida:null,
            stock: null,
            imagen: "",
            despartamento:"",
            seccion:"",
            familia:"",
            subfamilia:"",
        };
    },

    created(){
        axios
        .get("/api/productos")
        .then(response => {
            this.productos = response.data;
            console.log(this.productos)
        })
        .catch(error => {
            console.log(error);
        
        });
    },
    methods: {
        agregarProducto(){
            axios.post('/api/productos', {
                nombre: 'nombre',
                descripcion: 'descripcion',
                precio: 12.34,
                stock: 10,
                urlImg: 'urlImg',
                medida: 5.6,
                departamento: 'departamento',
                seccion: 'seccion'
                })
                .then(function (response) {
                console.log(response);
                })
                .catch(function (error) {
                console.log(error);
                });
        }
    }
}).mount("#app");

(function ($) {
    "use strict";

    // Spinner
    var spinner = function () {
        setTimeout(function () {
            if ($('#spinner').length > 0) {
                $('#spinner').removeClass('show');
            }
        }, 1);
    };
    spinner();
    
    
    // Back to top button
    $(window).scroll(function () {
        if ($(this).scrollTop() > 300) {
            $('.back-to-top').fadeIn('slow');
        } else {
            $('.back-to-top').fadeOut('slow');
        }
    });
    $('.back-to-top').click(function () {
        $('html, body').animate({scrollTop: 0}, 1500, 'easeInOutExpo');
        return false;
    });


    // Sidebar Toggler
    $('.sidebar-toggler').click(function () {
        $('.sidebar, .content').toggleClass("open");
        return false;
    });


    

    // Salse & Revenue Chart
    var ctx2 = $("#salse-revenue").get(0).getContext("2d");
    var myChart2 = new Chart(ctx2, {
        type: "line",
        data: {
            labels: ["2016", "2017", "2018", "2019", "2020", "2021", "2022"],
            datasets: [{
                    label: "Salse",
                    data: [15, 30, 55, 45, 70, 65, 85],
                    backgroundColor: "rgba(0, 156, 255, .5)",
                    fill: true
                },
                {
                    label: "Revenue",
                    data: [99, 135, 170, 130, 190, 180, 270],
                    backgroundColor: "rgba(0, 156, 255, .3)",
                    fill: true
                }
            ]
            },
        options: {
            responsive: true
        }
    });
    


   

    
})(jQuery);


