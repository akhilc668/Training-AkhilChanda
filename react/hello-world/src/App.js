import logo from './logo.svg';
import './App.css';
import Home,{id,name,email} from './components/Home.js'
import About from './components/About';
import ObjectArrayList from './components/ObjectArrayList';
import Routings from './components/Routings';
import RoutingsHeader from './components/RoutingsHeader';
import './../node_modules/bootstrap/dist/css/bootstrap.min.css';
import Propsobject from './components/Propsobject';
import StateObject from './Events/stateobject';
import StateObj from './Events/stateobj2';
import OnClickFun from './Events/Onclickfun';
import OnChangeFun from './Events/Onchangefun';
import Propsobj from './propobjects/ex1/propobj';
import Propsobject2 from './propobjects/ex5/Propsobject';
import Propsobject1 from './propobjects/ex2/Propsobject';
import StateProp from './propobjects/stateprop/StateProp';


function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h1 id="ah1">Nested Routings </h1>
        <StateProp />
        

      </header>
    </div>
  );
}

export default App;
