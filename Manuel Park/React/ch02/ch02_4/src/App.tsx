import P from './P'

export default function App() {
    const texts = ['Hello', "World"].map((text, index) => 
        <P key={index} children={text} />)
    return <div children={texts} />
}