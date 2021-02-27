import React,{  setState } from 'react'

//child CLASSES
class OnChangeFun extends  React.Component 
{

  constructor() 
  {
    super();

    //Step-1: Create state object and Initialization also
    this.state={ name:"" }
  }


  //Custom_class_Functions for StateHandlings
  HandleNameInput=(e)=>
    {
        this.setState({ name: e.target.value })
    }

    Mouseleave=()=>
    {
        alert(`${this.state.name}`)
    }

  render() {
     
     

      return(<>  

               <div class="container py-5">
                    <h3 className="text-center py-3">onChange</h3>

                    <div class="form-group">
                        <label>Name</label>
                        <input 
                        type="text" 
                        class="form-control" 
                        value={this.state.name}
                        onChange={this.HandleNameInput.bind(this) } onMouseLeave={this.Mouseleave} />
                    </div>


               </div>
            </>)
  }

}

export default OnChangeFun