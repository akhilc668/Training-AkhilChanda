import React,{  setState } from 'react'

//child CLASSES
class StateObj extends  React.Component 
{

  constructor() 
  {
    super();

    //Step-1: Create state object and Initialization also
    this.state={
                  id:1,
                  name:'kumar',
                  email:'kumar@gmail.com'
               }
  }


  //Custom_class_Functions for StateHandlings
  handleStateData=()=>
  {
    this.setState({   
                    id:101, 
                    name:'vijaykumar', 
                    email:"vijaykumar@gmail.com" 
                  })
  }




  render() 
  {
      return(<>  

               <div class="container py-5">
                    <h3 className="text-center py-3">CLASS_COMPONENT_with_STATE_OBJECT</h3>

                    <p> U_ID is: { this.state.id } </p>

                    <p>U_NAME is: { this.state.name } </p>

                    <p>U_EMAIL is: { this.state.email } </p>

                    <br /> <br />


                    <form>
                    
                    <label>U_ID</label>
                    <input type="number" value={this.state.id} />  <br /><br />

                    <label>U_NAME</label>
                    <input type="text" value={this.state.name} />  <br /><br />


                    <label>U_EMAIL</label>
                    <input type="email" value={this.state.email} />  <br /><br />


                    <button type="button"
                          className="btn btn-info" 
                          onClick={  this.handleStateData }> 
                          Change Multiple_Properties 
                    </button>



                    </form>


                    


               </div>
            </>)
  }

}

export default StateObj