# PowerHouse
An application that can perform the following:


a. As soon as the app opens call “/config” API, with email_id as
<your_name>@test.com (refer API guide below) and then open camera
screen.


b. Camera screen: A normal camera screen with a click button that
captures images. Then it needs to upload the image in parallel via
“/upload_image” API.
Note: The user should not wait for the image to be uploaded and the
application should fire a request to /upload_image (refer API guide
below)as soon as a new image is asked to be uploaded, without waiting
for the previous response from the API (e.g. after clicking the first
image, call upload image to upload image one; then on click 2 the app
should immediate call /upload_image in parallel without waiting for
image 1 response).


c. Google AR core (expected to study and implement): Upload the depth
image which should be generated with the same click as camera view
(having 2 calls with one click; first /upload_image for original image
and then /upload_depth for depth image) with the help of google AR
core API via “/upload_depth”
