import React from 'react'
import { Link }  from 'react-router-dom';

const Header=()=> {

    const styles={
        backgroundColor:'#475562',
        borderBottom:'0.5px white solid', 
        borderTop:'0.5px white solid'
    }

    return (<>

        <nav className="navbar navbar-expand-lg" style={styles}>

        <a className="navbar-brand text-white" href="#">Logo</a>

        <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav">
            <span className="navbar-toggler-icon"></span>
        </button>

        <div className="collapse navbar-collapse justify-content-end" id="navbarNav">

            <ul className="navbar-nav">
            
            <li className="nav-item active">
                    <Link className="nav-link text-white" to="/home">Home</Link>
            </li>

            <li className="nav-item">
                   <Link className="nav-link text-white" to="/about">About</Link>
            </li>
            <li className="nav-item">
                    <Link className="nav-link text-white" to="/services">Services</Link>
            </li>
           
            <li className="nav-item">
                    <Link className="nav-link text-white" to="/contact">Contact</Link>
            </li>

            <li className="nav-item">
                    <Link className="nav-link text-white" to="/courses">Courses</Link>
            </li>

            <li className="nav-item">
                    <Link className="nav-link text-white" to="/signup">Signup</Link>
            </li>

            <li className="nav-item">
                    <Link className="nav-link text-white" to="/propobj">Propsobject</Link>
            </li>           

            </ul>
        </div>
        </nav>


            </>)
}


export default Header