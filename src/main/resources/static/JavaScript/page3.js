
const grabImage = document.querySelector(".grabMe")



const grabbedCar = document.querySelector(".printCar")
const cars = document.querySelector(".carResult")
const grabbedRange = document.querySelector(".grabRange")
const grabbedSegment = document.querySelector(".grabSegment")
const grabbedPrice = document.querySelector(".grabPrice")
const grabDescription = document.querySelector(".descriptionText")


const fName = document.querySelector(".firstName")
const lName = document.querySelector(".lastName")
const PNR = document.querySelector(".PNR")
const emailValid = document.querySelector(".emailForValid")
const pNumber = document.querySelector(".pNumber")
const Address = document.querySelector(".address")
const zCode = document.querySelector(".zCode")
const cCity = document.querySelector(".cCity")

const fNameLabel = document.querySelector(".fNameLabel")
const lNameLabel = document.querySelector(".lNameLabel")
const PNRLabel = document.querySelector(".PNRLabel")
const emailLabel = document.querySelector(".emailLabel")
const pNumberLabel = document.querySelector(".pNumberLabel")
const addressLabel = document.querySelector(".addressLabel")
const zCodeLabel = document.querySelector(".zCodeLabel")
const cCityLabel = document.querySelector(".cCityLabel")
let reloadPage = true;
let count = 0;


function checkInfo() {
    
    
    if (fName.value === "") {
        console.log("förnamn inte giltig")
        fName.classList.add("wrong")
        fNameLabel.classList.remove("hide")
        
        
        
    } else {
        console.log("förnamn ok")
        fName.classList.remove("wrong")
        fName.classList.add("correct")
        fNameLabel.classList.add("hide")
        
        count++
    }
    if (lName.value === "") {
        console.log("efternamn inte giltig")
        lName.classList.add("wrong")
        lNameLabel.classList.remove("hide")
        
        
    } else {
        console.log("efternamn ok")
        lName.classList.remove("wrong")
        lName.classList.add("correct")
        lNameLabel.classList.add("hide")
        
        count++
    }
   
    if (PNR.value === "") {
        console.log("person nr inte giltig")
        PNR.classList.add("wrong")
        PNRLabel.classList.remove("hide")
        
        
    } else {
        console.log("person nr ok")
        PNR.classList.remove("wrong")
        PNR.classList.add("correct")
        PNRLabel.classList.add("hide")
        
        count++
    }
    if(!isValidEmailAddress(emailValid.value)) {
        console.log("Email icke giltig")
        emailValid.classList.add("wrong")
        emailLabel.classList.remove("hide")
        
        
    } else {
        console.log("email ok")
        emailValid.classList.remove("wrong")
        emailValid.classList.add("correct")
        emailLabel.classList.add("hide")
        
        count++
    }
    if (pNumber.value === "") {
        console.log("person nr inte giltig")
        pNumber.classList.add("wrong")
        pNumberLabel.classList.remove("hide")
        
        
    } else {
        console.log("telefon nr ok")
        pNumber.classList.remove("wrong")
        pNumber.classList.add("correct")
        pNumberLabel.classList.add("hide")
        
        count++
    }
    if (Address.value === "") {
        console.log("adress inte giltig")
        Address.classList.add("wrong")
        addressLabel.classList.remove("hide")
        reloadPage = false;
        
    } else {
        console.log("adress ok")
        Address.classList.remove("wrong")
        Address.classList.add("correct")
        addressLabel.classList.add("hide")
        
        count++
    
    }
    if (zCode.value === "") {
        console.log("postnr inte giltig")
        zCode.classList.add("wrong")
        zCodeLabel.classList.remove("hide")
        
        
        
    } else {
        console.log("postnr nr ok")
        zCode.classList.remove("wrong")
        zCode.classList.add("correct")
        zCodeLabel.classList.add("hide")
        
        count++
    }
    if (cCity.value === "") {
        console.log("stad inte giltig")
        cCity.classList.add("wrong")
        cCityLabel.classList.remove("hide")
       
        
    } else {
        console.log("stad ok")
        cCity.classList.remove("wrong")
        cCity.classList.add("correct")
        cCityLabel.classList.add("hide")
        
        count++
    }
    console.log(count)
    if(count >= 8) {
        return true;
    } else { return false;}

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

