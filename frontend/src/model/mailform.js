import emailjs from '@emailjs/browser';


    export default function sendEmail() {
      emailjs.sendForm('service_ex27v2q', 'template_m8q2lkn', this.$refs.form, '8J7p0cEByRscJTDXU')
        .then((result) => {
            console.log('SUCCESS!', result.text);
        }, (error) => {
            console.log('FAILED...', error.text);
        });
        return sendEmail;
    }
  
 
