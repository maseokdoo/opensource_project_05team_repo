document.getElementById('root')?.addEventListener('click', (e: Event) => {
    const {isTrusted, target, bubbles} = e
    console.log('Mouse Click Occurs.', isTrusted, target, bubbles)
})
document.getElementById('root')?.addEventListener('click', (e: Event) => {
    const {isTrusted, target, bubbles} = e
    console.log("Mouse Click Also Occurs.", isTrusted, target, bubbles)
})

export default function EventListener() {
    return <div>EventListener</div>
}