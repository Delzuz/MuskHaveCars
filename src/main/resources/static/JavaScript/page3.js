
const grabImage = document.querySelector(".grabMe")



const grabbedCar = document.querySelector(".printCar")
const cars = document.querySelector(".carResult")
const grabbedRange = document.querySelector(".grabRange")
const grabbedSegment = document.querySelector(".grabSegment")
const grabbedPrice = document.querySelector(".grabPrice")
const grabDescription = document.querySelector(".descriptionText")


const fName = document.querySelector(".firstName")
const emailValid = document.querySelector(".emailForValid")

function checkInfo() {
    
    console.log(fName + "den kom")

    if (fName.value === "") {
        console.log("det funkar INTe")
        return false;
    } else {
        console.log("DET FUNKAR")
        
    }

    if(!isValidEmailAddress(emailValid.value)) {
        console.log("Email är inte bra ")
        return false;
    } else {
        console.log("email är bra")
        
    }

}

function isValidEmailAddress(email){

    return String(email)

        .toLowerCase()

        .match(

            /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/

        ) != null

};
        
async function getAllCars() {
    let carArray = await fetch('http://localhost:8080/car')
    return await carArray.json()

}



printCars()
async function printCars() {
    let bil = await getAllCars()

    grabDescription.innerHTML = bil.description
    grabImage.src = `/Images/${bil.id}.png`
    grabbedRange.innerHTML = `${bil.range} km`
    grabbedSegment.innerHTML = bil.carSegment.segmentName
    grabbedPrice.innerHTML = `${bil.carSegment.price} sek/day`


}

