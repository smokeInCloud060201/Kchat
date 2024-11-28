import React, { useState } from "react";
import { StompSessionProvider, useSubscription } from "react-stomp-hooks";
import PublishMessage from "./page/PublishMessage";

const App = () => {
  const ChildComponent = () => {
    const [message, setMessage] = useState("");
    // Subscribe to the topic that we have opened in our spring boot app
    useSubscription("/topic/reply", (message) => {
      setMessage(message.body);
    });

    return <div> The broadcast message from websocket broker is {message}</div>;
  };

  return (
    <div>
      <StompSessionProvider url={"http://localhost:8444/ws-endpoint"}>
        <ChildComponent />
        <PublishMessage />
      </StompSessionProvider>
    </div>
  );
};

export default App;
