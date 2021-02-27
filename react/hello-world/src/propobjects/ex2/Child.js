import React from 'react'

const Child=(props)=> {

//object_destructering...
const {id,name,email}=props

    return (<>

           <div className="container py-5">
           
                 <h3>CHILD COMPONENT</h3>

                 { id } - {name} - {email}

           </div>

            </>)
}

export default Child
