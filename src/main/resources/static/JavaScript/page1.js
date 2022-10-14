const locations = document.querySelector(".locationsArray")
const fromDate = document.querySelector(".from")
const toDate = document.querySelector(".to")

const choice = document.querySelector(".carChoice")
const fromLabel = document.querySelector(".fromLabel")
const toLabel = document.querySelector(".toLabel")
        let date = new Date();  
        async function getAllLocations() {
            let locationsArray = await fetch('http://localhost:8080/geoCities')
            return await locationsArray.json()

        }

        printLocations()
        async function printLocations() {
            let locationsFetch = await getAllLocations()
            let html = '<option value="">Choose Car</option> '
            for (let l of locationsFetch) {
                html += `
                <option value="${l.id}">${l.cityName}</option> `
            }

            locations.innerHTML = html

        }

        function goingToNextPage () {
            console.log("TEST")
            console.log(date)
            if(locations.value === "") {
                choice.classList.remove("hide")
                
                    
            } else{choice.classList.add("hide")}
            console.log(locations.value)

            if(fromDate.value < date) {
                fromLabel.classList.remove("hide")
                return false;
            } else {fromLabel.classList.add("hide")}
            console.log(fromDate.value)

            if(toDate.value < fromDate.value) {
                toLabel.classList.remove("hide")
                return false;
            } else {
                console.log(toDate.value)
                toLabel.classList.add("hide") 
                return true;
            }
           
            

            

        }
        // const form = document.querySelector(".test")

        // const userAction = async () => {
        //     const response = await fetch('http://localhost:8080/postPage1Data', {
        //         method: 'POST',
        //         body: form,
        //         headers: {
        //             'Contenttype': 'application/json'
        //         }
        //     });
        //     const myJson = await response.json()

        // }