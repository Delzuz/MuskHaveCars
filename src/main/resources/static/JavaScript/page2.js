
    const grabCars = document.querySelector(".cars")

        

    

    
    async function getAllCars() {
        let carArray = await fetch('http://localhost:8080/carsLocation')
        return await carArray.json()

    }

    async function getAllQuantity() {
        let carQuant = await fetch('http://localhost:8080/carQuantity')
        return await carQuant.json()

    }

    printCars()
    async function printCars() {
        let bilar = await getAllCars()
        let carQuant = await getAllQuantity()
        let html = `<form action="/postPage2Data" method="post">
            <div class="container text-center">
            <div class="row">`

        let n = 0;
        for (let i = 0; bilar.length > i; i++) {
            // i++
            n++
            if (n <= 3) {

                html += `                    <div class="col testgrab">
                        <img src="/Images/${bilar[i].id}.png" class="img-fluid" alt="...">
                        <div class="carText">
                            <div class="fw-semibold">Car:
                                <span class="fw-normal">${bilar[i].carName}</span>
                            </div>
                            <div class="fw-semibold">Description:
                                <span class="fw-normal">${bilar[i].description}</span>
                            </div>
                            <div class="fw-semibold">Range:
                                <span class="fw-normal">${bilar[i].range}</span>
                            </div>
                            <div class="fw-semibold">Segment:
                                <span class="fw-normal">${bilar[i].carSegment.segmentName}</span>
                            </div>
                            <div class="fw-semibold">Price:
                                <span class="fw-normal">${bilar[i].carSegment.price} sek</span>
                            </div>
                            <div class="fw-semibold">Quantity:
                            <span class="fw-normal">${carQuant[i]} quantity</span>
                        </div>
                        </div>
                        <button value="${bilar[i].id}" type="submit" class="btn btn-dark" name= "carButton">Select</button>
                    </div>`

            }

            if (n > 2) {
                html += `<div class="row">`
                n = 0;

            }   
        }

    

        html += `</div></div></form>`

        grabCars.innerHTML = html

    }

