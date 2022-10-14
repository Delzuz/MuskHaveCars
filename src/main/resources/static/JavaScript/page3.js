
const grabImage = document.querySelector(".grabMe")



const grabbedCar = document.querySelector(".printCar")
const cars = document.querySelector(".carResult")
const grabbedRange = document.querySelector(".grabRange")
const grabbedSegment = document.querySelector(".grabSegment")
const grabbedPrice = document.querySelector(".grabPrice")
const grabDescription = document.querySelector(".descriptionText")



        
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
