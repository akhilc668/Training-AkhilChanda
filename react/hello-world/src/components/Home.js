//Home Component...Externally
import React from 'react';


//Import Components
import About from './About.js'
import Services from './Services.js'
import Contact from './Contact.js'

var id=1001,name="kumar",email="kumar@gmail.com"
//Home Component
const Home=()=> {    
    return(<div >
        <div style={{ backgroundColor:'lightblue',textAlign:'center' }}>
                <h1 style={{ color:'red',textAlign:'center' }}>HOME COMPONENT</h1>

                {id}-{name}-{email}
               
                    <ol style={{ backgroundColor:'lightseagreen',textAlign:'center' }}>
                        <li>{id}</li>
                        <li>{name}</li>
                        <li>{email}</li>
                    </ol>
        </div>
                
        </div>);
}
export {id,name,email}
export default Home
