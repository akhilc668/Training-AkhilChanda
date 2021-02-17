//About Component...Externally
import React from 'react';
import users from './json/userdata.json'

//About Component
const About=()=> {    
    {/*var users={
        id:1,
        name:'kumar',
        phone:7896541230,
        email:'kumar@gmail.com'
    }*/}
    const finalresult=users.map( (result,index)=>{        
        return(<ul key={index}>
                   <li> {result.id} </li>
                   <li> {result.name} </li>
                   <li> {result.email} </li>
                   <li> {result.phno} </li>
               </ul>)
   })
    return(<div style={{ backgroundColor:'lightblue',textAlign:'center' }}>
                <h1 style={{ color:'red',textAlign:'center' }}>ABOUT COMPONENT</h1>
                {/*<p style={{ backgroundColor:'lightseagreen',textAlign:'center' }}>{users.id}-{users.name}-{users.phone}-{users.email}</p>*/}
                { finalresult }
        </div>);
}

export default About
