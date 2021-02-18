import logo from './logo.svg';
import './App.css';
import Home,{id,name,email} from './components/Home.js'
import About from './components/About';
import ObjectArrayList from './components/ObjectArrayList';
import Routings from './components/Routings';
import RoutingsHeader from './components/RoutingsHeader';
import './../node_modules/bootstrap/dist/css/bootstrap.min.css';
import Propsobject from './components/Propsobject';


function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h1 id="ah1">Nested Routings </h1>
        <RoutingsHeader />
        

      </header>
    </div>
  );
}

export default App;
