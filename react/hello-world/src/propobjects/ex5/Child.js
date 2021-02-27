import React from 'react'

const Child=( {id,name,email,phone}  )=> {

    return (<>

           <div className="container py-5">
           
                 <h3>CHILD COMPONENT</h3>

                 { id } - {name} - {email}-{phone}

           </div>

            </>)
}

export default Child
