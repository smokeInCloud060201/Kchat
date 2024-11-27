import React, {useEffect} from 'react'
import {WS} from "./services";
import wsApi from "./services/ws/api";

const App = () => {

  useEffect(() => {

  }, [wsApi]);

  return <div>This is just a demo</div>
}

export default App
