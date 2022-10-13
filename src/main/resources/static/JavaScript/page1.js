const locations = document.querySelector(".locationsArray")

        
        async function getAllLocations() {
            let locationsArray = await fetch('http://localhost:8080/geoCities')
            return await locationsArray.json()

        }

        printLocations()
        async function printLocations() {
            let locationsFetch = await getAllLocations()
            let html = ''
            for (let l of locationsFetch) {
                html += `
                <option value="${l.id}">${l.cityName}</option>`
            }

            locations.innerHTML = html

        }
        const form = document.querySelector(".test")

        const userAction = async () => {
            const response = await fetch('http://localhost:8080/postPage1Data', {
                method: 'POST',
                body: form,
                headers: {
                    'Contenttype': 'application/json'
                }
            });
            const myJson = await response.json()

        }