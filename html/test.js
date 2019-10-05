// $(document).ready(function() {
//     $('.radioshow').on('change', function() { 
//         var val = $(this).attr('data-class'); 
//         $('.allshow').hide();
//         $('.' + val).show();        
//     });
// }); 

// alert("connected");

// function show1(){
//     document.getElementById('div1').style.display ='none';
//   }
//   function show2(){
//     document.getElementById('div1').style.display = 'block';
//   }
//   function show3(){
//     document.getElementById('div2').style.display = " block";
//   }

const app = new Vue({
    el:'#app',
    data: {
      cats:[],
      newCat:null
    },
    mounted() {
      
      if(localStorage.getItem('cats')) {
        try {
          this.cats = JSON.parse(localStorage.getItem('cats'));
        } catch(e) {
          localStorage.removeItem('cats');
        }
      }
    },
    methods: {
      addCat() {
        // ensure they actually typed something
        if(!this.newCat) return;
        this.cats.push(this.newCat);
        this.newCat = '';
        this.saveCats();
      },
      removeCat(x) {
        this.cats.splice(x,1);
        this.saveCats();
      },
      saveCats() {
        let parsed = JSON.stringify(this.cats);
        localStorage.setItem('cats', parsed);
      }
    }
  })