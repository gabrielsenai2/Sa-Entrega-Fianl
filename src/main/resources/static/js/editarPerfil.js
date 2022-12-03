let photo = document.getElementById('imgPhoto')
let file = document.getElementById('fiimage')


photo.addEventListener('click', () => {
file.click();
});



file.addEventListener('change', () => {

    if(file.files.length <= 0) {
        return;
    }


    let reader = new FileReader();

    reader.onload = () => {
        photo.src = reader.result
    }


    reader.readAsDataURL(file.files[0])

});


// let bak = document.getElementById('bg')
// let files = document.getElementById('fundo')


// bak.addEventListener('click', () => {
// files.click();
// });



// files.addEventListener('change', () => {

//     if(file.files.length <= 0) {
//         return;
//     }


//     let reader = new FileReader();

//     reader.onload = () => {
//         bak.src = reader.result
//     }


//     reader.readAsDataURL(files.files[0])

// });