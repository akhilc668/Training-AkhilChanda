import React, { Component } from 'react'

class Signup extends Component {

    constructor(props) {
        super(props);

        this.state=
        {
            name:'',
            email:'',
            city:'',
            course:'',
            phone:''
        }
    }


    //name_input
    HandleNameInput=(e)=>
    {
        this.setState({ name: e.target.value })
    }

    //email_input
    HandleEmailInput=(e)=>
    {
        this.setState({ email: e.target.value })
    }

    HandleCityInput=(e)=>
    {
        this.setState({ city: e.target.value })
    }



//submit_button
HandleSubmitForm=()=>
{
    alert(`${this.state.name}-${this.state.email}-${this.state.city}`);
}



    render() {
        return (<>
    <div className="container p-5">
                
            

            <form>
                    <div class="form-group">
                        <label>Name</label>
                        <input 
                        type="text" 
                        class="form-control" 
                        value={this.state.name}
                        onChange={this.HandleNameInput.bind(this) } />
                    </div>

                    <div class="form-group">
                        <label>Email</label>
                        <input 
                        type="email" 
                        class="form-control" 
                        value={this.state.email}
                        onChange={this.HandleEmailInput.bind(this) } />
                    </div>

                    <div class="form-group">
                        <label>City</label>
                        <input 
                        type="city" 
                        class="form-control" 
                        value={this.state.city}
                        onChange={this.HandleCityInput.bind(this) } />
                    </div>
                    
                    <button 
                    type="button" 
                    class="btn btn-primary"
                    onClick={this.HandleSubmitForm}>Submit</button>

            </form>

    </div>
        </>)
    }
}

export default Signup 
