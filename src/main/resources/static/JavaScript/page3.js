
const grabImage = document.querySelector(".grabMe")



const grabbedCar = document.querySelector(".printCar")
const cars = document.querySelector(".carResult")
const grabbedRange = document.querySelector(".grabRange")
const grabbedSegment = document.querySelector(".grabSegment")
const grabbedPrice = document.querySelector(".grabPrice")
const grabDescription = document.querySelector(".descriptionText")


const fName = document.querySelector(".firstName")
const lNamn = document.querySelector(".lastName")
const PNR = document.querySelector(".PNR")
const emailValid = document.querySelector(".emailForValid")
const pNumber = document.querySelector(".pNumber")
const Address = document.querySelector(".address")
const zCode = document.querySelector(".zCode")
const cCity = document.querySelector(".cCity")


function checkInfo() {
    
    if (fName.value === "") {
        console.log("förnamn inte giltig")
        return false;
    } else {
        console.log("förnamn ok")

    }

    if (lNamn.value === "") {
        console.log("efternamn inte giltig")
        return false;
    } else {
        console.log("efternamn ok")
        
    }
   
    if (PNR.value === "") {
        console.log("person nr inte giltig")
        return false;
    } else {
        console.log("person nr ok")
    
    }

    if(!isValidEmailAddress(emailValid.value)) {
        console.log("Email icke giltig")
        return false;
    } else {
        console.log("email ok")
        
    }

    if (pNumber.value === "") {
        console.log("person nr inte giltig")
        return false;
    } else {
        console.log("telefon nr ok")
    
    }

    if (Address.value === "") {
        console.log("adress inte giltig")
        return false;
    } else {
        console.log("adress ok")
    
    }

    if (zCode.value === "") {
        console.log("postnr inte giltig")
        return false;
    } else {
        console.log("postnr nr ok")
    
    }

    if (cCity.value === "") {
        console.log("stad inte giltig")
        return false;
    } else {
        console.log("stad ok")
    
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

