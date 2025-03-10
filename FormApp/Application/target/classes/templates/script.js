async function submitForm(event) {
    event.preventDefault(); // Prevent the default form submission

    const formData = {
        name: document.getElementById('name').value,
        email: document.getElementById('email').value,
        dateOfBirth: document.getElementById('dateOfBirth').value,
        department: document.getElementById('department').value
    };

    try {
        const response = await fetch('http://localhost:9090/api/formdata', { // Adjust the URL to your backend endpoint
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(formData)
        });

        if (response.ok) {
            const result = await response.json();
            document.getElementById('responseMessage').innerText = 'Form submitted successfully!';
            document.getElementById('formData').reset(); // Reset the form
        } else {
            const error = await response.json();
            document.getElementById('responseMessage').innerText = `Error: ${error.message}`;
        }
    } catch (error) {
        document.getElementById('responseMessage').innerText = `Error: ${error.message}`;
    }
}