
    const grabCars = document.querySelector(".cars")
    

    
    async function getAllCars() {
        let carArray = await fetch('http://localhost:8080/cars')
        return await carArray.json()

    }

    printCars()
    async function printCars() {
        let bilar = await getAllCars()
        let html = `<form action="/test" method="post">
            <div class="container text-center">
            <div class="row">`

        let i = 0;
        for (let c of bilar) {
            i++
            if (i <= 3) {

                html += `                    <div class="col">
                        <img src="/Images/${c.id}.png" class="img-fluid" alt="...">
                        <div class="carText">
                            <div class="fw-semibold">Car:
                                <span class="fw-normal">${c.carName}</span>
                            </div>
                            <div class="fw-semibold">Description:
                                <span class="fw-normal">${c.description}</span>
                            </div>
                            <div class="fw-semibold">Range:
                                <span class="fw-normal">${c.range}</span>
                            </div>
                            <div class="fw-semibold">Segment:
                                <span class="fw-normal">Normal weight text.</span>
                            </div>
                            <div class="fw-semibold">Price:
                                <span class="fw-normal">Normal weight text.</span>
                            </div>
                        </div>
                        <button value="${c.id}" type="submit" class="btn btn-outline-primary" name= "button">Primary</button>
                    </div>`

            }

            if (i > 2) {
                html += `<div class="row">`
                i = 0;

            }   
        }

    

        html += `</div></div></form>`

        grabCars.innerHTML = html

    }

