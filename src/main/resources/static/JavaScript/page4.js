
const grabConf = document.querySelector(".grabConf")
const grabCarName = document.querySelector(".grabCar")
const grabFirst = document.querySelector(".grabfName")
const grabLast = document.querySelector(".grablName")
const grabFromDate = document.querySelector(".grabfDate")
const grabToDate = document.querySelector(".grabtDate")
const grabPrice = document.querySelector(".grabPrice")
        
async function getRental() {
    let carArray = await fetch('http://localhost:8080/getConfirmation')
    return await carArray.json()

}



printCars()
async function printCars() {
    let rental = await getRental()

    grabConf.innerHTML = rental.id

    grabCarName.innerHTML = rental.car.carName

    grabFirst.innerHTML = rental.customer.firstName

    grabLast.innerHTML = rental.customer.lastName

    grabFromDate.innerHTML = rental.fromDate

    grabToDate.innerHTML = rental.toDate

    grabPrice.innerHTML = rental.totalPrice
    


}