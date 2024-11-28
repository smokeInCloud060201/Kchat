const WS_BASE_HOST = process.env.REACT_APP_WS_HOST_BASE;

const wsApi = new WebSocket(WS_BASE_HOST);

export default wsApi;
