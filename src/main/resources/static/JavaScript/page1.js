const locations = document.querySelector(".locationsArray")
const fromDate = document.querySelector(".from")
const toDate = document.querySelector(".to")

const choice = document.querySelector(".carChoice")
const fromLabel = document.querySelector(".fromLabel")
const toLabel = document.querySelector(".toLabel")
        
        async function getAllLocations() {
            let locationsArray = await fetch('http://localhost:8080/geoCities')
            return await locationsArray.json()

        }

        printLocations()
        async function printLocations() {
            let locationsFetch = await getAllLocations()
            let html = '<option value="">Choose a location</option> '
            for (let l of locationsFetch) {
                html += `
                <option value="${l.id}">${l.cityName}</option> `
            }

            locations.innerHTML = html

        }

        function getTodaysDate() {
            let today = new Date
            let dd = today.getDate();
        
            let mm = today.getMonth() + 1;
            let yyyy = today.getFullYear();
            if (dd < 10) {
                dd = '0' + dd;
            }
        
            if (mm < 10) {
                mm = '0' + mm;
            }
        
            today = yyyy + '-' + mm + '-' + dd;
            console.log(today);
            return today;
        }
        

        function goingToNextPage () {
            console.log("TEST")
            
            console.log(getTodaysDate())
            if(locations.value === "") {
                choice.classList.remove("hide")
                
                    
            } else{choice.classList.add("hide")}
            console.log(locations.value)

            if(fromDate.value < getTodaysDate()) {
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